package de.applegreen.Buyssd.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface hasLogger {

    default Logger logger() {
        return LoggerFactory.getLogger(this.getClass());
    }
}
