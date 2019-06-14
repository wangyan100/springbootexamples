package org.yw.springbootelasticsearch.indicator;


import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.search.SearchType;
import org.elasticsearch.client.Client;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class HandyIndicator implements HealthIndicator {

    @Autowired
    Client client;

    @Override
    public Health health() {
        Health health;
        try {
            SearchResponse response = client.prepareSearch("handys")
                    .setTypes("handy")
                    .setSearchType(SearchType.QUERY_THEN_FETCH)
                    .setQuery(QueryBuilders.matchAllQuery())
                    .get();
            List<SearchHit> searchHits = Arrays.asList(response.getHits().getHits());
            int handyCount = searchHits.size();

            if (handyCount > 0) {
                health = Health.up()
                        .withDetail("count", handyCount)
                        .withDetail("message", "We have enough Handys.")
                        .build();
            } else {
                health = Health.down()
                        .withDetail("count", 0)
                        .withDetail("message", "We have no enough Handys.")
                        .build();
            }
            return health;
        } catch (Exception e) {
            health = Health.down()
                    .withDetail("count", 0)
                    .withDetail("message", "We have no enough Handys.")
                    .build();
            return health;
        }
    }
}
