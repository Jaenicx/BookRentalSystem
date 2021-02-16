/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package log4j;

import org.apache.log4j.Logger;


/**
 *
 * @author Jaenicx
 */
public class Log4J {
   private static final Logger log = Logger.getLogger(Log4J.class);

	public static void main(String[] args) {

		try {
			throw new Exception("New Exception");
		} catch (Exception e) {
			log.error(e, e);
		}

	}
}
