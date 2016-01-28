
//import org.springframework.cache.ehcache.EhCacheFactoryBean
//import org.springframework.cache.ehcache.EhCacheManagerFactoryBean


class ChadoGrailsPlugin {
    def version = "0.1"
    def grailsVersion = "2.4 > *"
    def title = "Chado Plugin for Grails"
    def author = "Nathan Dunn"
    def authorEmail = "nathandunn@lbl.gov"
    def description = 'A Grails plugin for the chado biological schema, for interacting with a chado database: http://gmod.org/wiki/Chado_-_Getting_Started'
    def documentation = "http://grails.org/plugin/chado"
    def license = "APACHE"
    def organization = [name: "Apollo", url: "http://genomearchitect.org"]
    def issueManagement = [url: 'https://github.com/GMOD/chado-plugin-grails/issues']
    def scm = [url: 'https://github.com/GMOD/chado-plugin-grails']

    def doWithSpring = {
//        ReflectionUtils.application = application
//        def conf = SpringSecurityUtils.securityConfig

        println "Loading Chado Domains ..."

//        cacheManager(EhCacheManagerFactoryBean) {
//            cacheManager = ref('cacheManager')
//            cacheManager(EhCacheManagerFactoryBean) {
//                cacheManagerName = 'chado-' + UUID.randomUUID()
//            }
//        }

    }
}
