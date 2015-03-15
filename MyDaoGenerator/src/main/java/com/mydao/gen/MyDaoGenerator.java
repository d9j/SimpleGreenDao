package com.mydao.gen;
import de.greenrobot.daogenerator.DaoGenerator;
import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;
public class MyDaoGenerator {

    public static void main(String args[]) throws Exception {
        Schema schema = new Schema(3, "com.mydao.sample");
        addBox(schema);
        new DaoGenerator().generateAll(schema, args[0]);
    }
    private static void addBox(Schema schema){
        Entity box = schema.addEntity("Box");

        box.addIdProperty();
        box.addStringProperty("name");
        box.addIntProperty("slots");
        box.addStringProperty("description");

    }


}
