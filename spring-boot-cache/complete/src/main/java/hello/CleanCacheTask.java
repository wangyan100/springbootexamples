package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class CleanCacheTask {
    private static final Logger logger = LoggerFactory.getLogger(CleanCacheTask.class);
    @Autowired
    CacheManager cacheManager;
    public void evictAllCaches() {
        cacheManager.getCacheNames().stream()
                .forEach(cacheName ->
                        cacheManager.getCache(cacheName).clear());
    }

    @Scheduled(fixedRate = 12000)
    public void cacheEvictionScheduler() {
        logger.info("every 12 seconds, evicting all entries from Cache .");
        evictAllCaches();
    }
}
