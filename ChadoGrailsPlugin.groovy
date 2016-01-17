class ChadoGrailsPlugin {
    // the plugin version
    def version = "0.1"
    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "2.4 > *"
    // resources that are excluded from plugin packaging
    def pluginExcludes = [
        "grails-app/views/error.gsp"
    ]

    // TODO Fill in these fields
    def title = "Chado Plugin for Grails" // Headline display name of the plugin
    def author = "Nathan Dunn"
    def authorEmail = "nathandunn@lbl.gov"
    def description = '''\
	A grails plugin for the chado biological schema.   Used for interacting with a chado database.
    http://gmod.org/wiki/Chado_-_Getting_Started
'''

    // URL to the plugin's documentation
    def documentation = "http://grails.org/plugin/chado"

    // Extra (optional) plugin metadata

    // License: one of 'APACHE', 'GPL2', 'GPL3'
    def license = "APACHE"

    // Details of company behind the plugin (if there is one)
    def organization = [ name: "Apollo", url: "http://genomearchitect.org" ]

    // Any additional developers beyond the author specified above.
    def developers = [
            [ name: "Nathan Dunn", email: "nathandunn@lbl.gov" ]
    ]

    // Location of the plugin's issue tracker.
//    def issueManagement = [ system: "GitHub", url: "http://github.org/GMOD/chado-plugin-grails" ]
//    def issueManagement = [ system: "GitHub", url: "http://github.org/nathandunn/chado-plugin-grails" ]

    // Online location of the plugin's browseable source code.
//    def scm = [ url: "http://github.org/nathandunn/chado-plugin-grails" ]
    def dependsOn = [:]
    def loadAfter = ['core', 'dataSource']

    def doWithWebDescriptor = { xml ->
        // TODO Implement additions to web.xml (optional), this event occurs before
    }

    def doWithSpring = {
        // TODO Implement runtime spring config (optional)
    }

    def doWithDynamicMethods = { ctx ->
        // TODO Implement registering dynamic methods to classes (optional)
    }

    def doWithApplicationContext = { ctx ->
        // TODO Implement post initialization spring config (optional)
    }

    def onChange = { event ->
        // TODO Implement code that is executed when any artefact that this plugin is
        // watching is modified and reloaded. The event contains: event.source,
        // event.application, event.manager, event.ctx, and event.plugin.
    }

    def onConfigChange = { event ->
        // TODO Implement code that is executed when the project configuration changes.
        // The event is the same as for 'onChange'.
    }

    def onShutdown = { event ->
        // TODO Implement code that is executed when the application shuts down (optional)
    }
}
