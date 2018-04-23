/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kingkong.dataabstraction.entities;

/**
 *
 * @author kiran
 */
public abstract class Guitar {
    /*
        abstract method ->must have abstract class
                       ->must not define method body
                       -> must implement in extended child class
             
    */
    /*
        -abstract class can have constructor but cannot be defined
        -use interface that contain methods only
    */
    public abstract void play();
    
}
