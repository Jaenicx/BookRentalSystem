/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import service.Factory;
import service.IService;

/**
 *
 * @author Jaenicx
 */
public class Manager {
      private Factory factory = new Factory(); //instantiate factory

    protected IService getService(String serviceName) throws Exception {
        return factory.getService(serviceName);
    }

}
