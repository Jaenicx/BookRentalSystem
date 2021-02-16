/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.io.FileInputStream;
import java.util.Properties;

/**
 *
 * @author Jaenicx
 */
public class Factory {
    
    public IService getService(String serviceName) throws Exception //throws ServiceLoadException
    {
        try {
            //System.out.println(""+serviceName);
            Class<?> c = Class.forName(getImplementationName(serviceName));
            //return (IService) c.newInstance();
        } catch (Exception e) {
            System.out.println(""+ e.getMessage());
            //throw new ServiceLoadException(serviceName + "not loaded: "+e.toString());t
        }
        return (IService) new service.implementation.LibrarySystemImplementation_Hibernate();
  
    }

    private String getImplementationName(String serviceName) throws Exception {
        Properties props = new Properties();
        FileInputStream fis = new FileInputStream("config/properties.txt");
        props.load(fis);
        fis.close();
        return props.getProperty(serviceName);
    }//--------------------

}

