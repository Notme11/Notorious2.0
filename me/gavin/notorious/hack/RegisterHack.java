// 
// Decompiled by Procyon v0.5.36
// 

package me.gavin.notorious.hack;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;

@Retention(RetentionPolicy.RUNTIME)
public @interface RegisterHack {
    String name();
    
    String description();
    
    Hack.Category category();
}