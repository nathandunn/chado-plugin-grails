package org.gmod.chado

import grails.util.Holders
//import org.hibernate.cfg.ImprovedNamingStrategy


/**
 * Created by nathandunn on 1/14/16.
 * TODO: do with hibernate 4
 */
class NamingStrategy {
//        extends ImprovedNamingStrategy {
    String classToTableName(String className){
        Class clazz = Holders.grailsApplication.domainClasses.find { it.clazz.simpleName == className }.clazz
        String packageName = clazz.getPackage().getName()
        "${packageName}__${className.toLowerCase()}"
    }
}
