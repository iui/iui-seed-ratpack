package org.iuijs.ratpack

/**
 * Created with IntelliJ IDEA.
 * User: sean
 * Date: 5/23/13
 * Time: 2:49 PM
 * To change this template use File | Settings | File Templates.
 */

import org.ratpackframework.groovy.RatpackScriptApp;

import java.io.File;

class Main {
    public static void main(String[] args) throws Exception {
        File ratpackFile = args.length == 0 ? new File("ratpack.groovy") : new File(args[0]);
        if (!ratpackFile.exists()) {
            System.err.println("Ratpack file " + ratpackFile.getAbsolutePath() + " does not exist");
            System.exit(1);
        }


        RatpackScriptApp.ratpack(ratpackFile).startAndWait();
    }
}
