// configuration for plugin testing - will not be included in the plugin zip

grails.plugin.reveng.packageName = "org.gmod.chado"

//grails.plugin.reveng.includeTables = [
//        "cvterm"
//        ,"cvtermdbxref"
//        ,"db"
//        ,"dbxref"
//        ,"feature"
////        ,"feature_phenotype"
////        ,"feature_genotype"
//        ,"feature_cvterm"
//        ,"feature_synonym"
//        ,"feature_relationship"
//        ,"featureloc"
////        ,"genotype"
//        ,"organism"
//        ,"pub"
//        ,"pub_relationship"
//        ,"synonym"
//]

log4j = {
    // Example of changing the log pattern for the default console
    // appender:
    //
    //appenders {
    //    console name:'stdout', layout:pattern(conversionPattern: '%c{2} %m%n')
    //}

    error  'org.codehaus.groovy.grails.web.servlet',  //  controllers
           'org.codehaus.groovy.grails.web.pages', //  GSP
           'org.codehaus.groovy.grails.web.sitemesh', //  layouts
           'org.codehaus.groovy.grails.web.mapping.filter', // URL mapping
           'org.codehaus.groovy.grails.web.mapping', // URL mapping
           'org.codehaus.groovy.grails.commons', // core / classloading
           'org.codehaus.groovy.grails.plugins', // plugins
           'org.codehaus.groovy.grails.orm.hibernate', // hibernate integration
           'org.springframework',
           'org.hibernate',
           'net.sf.ehcache.hibernate'
}

grails.cache.config.cache.enabled = false

//grails.cache.config = {
//    // avoid ehcache naming conflict to run multiple WA instances
//    provider {
//        name "ehcache-chado-"+(new Date().format("yyyyMMddHHmmss"))
//    }
//    cache {
//        enabled =false
//        name 'chadocache'
//        eternal false
//        overflowToDisk true
//        maxElementsInMemory 10000
//        maxElementsOnDisk 10000000
//    }
//    defaultCache {
//        maxElementsInMemory 10000
//        eternal false
//        timeToIdleSeconds 120
//        timeToLiveSeconds 120
//        overflowToDisk true
//        maxElementsOnDisk 10000000
//        diskPersistent false
//        diskExpiryThreadIntervalSeconds 120
//        memoryStoreEvictionPolicy 'LRU'
//    }
//}
