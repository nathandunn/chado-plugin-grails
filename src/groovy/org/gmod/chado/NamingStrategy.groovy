package org.gmod.chado

import org.hibernate.cfg.ImprovedNamingStrategy

/**
 * @author nathandunn
 */
class NamingStrategy extends ImprovedNamingStrategy {
    String classToTableName(String className) {
        "chado.${className.toLowerCase()}"
    }
}
