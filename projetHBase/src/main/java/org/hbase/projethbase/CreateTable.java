/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hbase.projethbase;

import java.io.IOException;
import java.util.Collection;
import org.apache.hadoop.conf.Configuration;

import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.client.HBaseAdmin;
import org.apache.hadoop.hbase.TableName;

/**
 *
 * @author archange
 */
public class CreateTable {

    public static void main(String[] args) throws IOException {
        //instanciation configuration class
        Configuration con = HBaseConfiguration.create();

        //Instantiating HbaseAdmin clas
        HBaseAdmin admin = new HBaseAdmin(con);
/*
        if (admin.isTableAvailable("emp1")) {
            admin.snapshot("mysnap", TableName.valueOf("emp1"));
            System.out.println("sauvegard ok");
        } else {

            //instantiating table descriptor class
            HTableDescriptor tableDescriptor = new HTableDescriptor(TableName.valueOf("emp1"));

            //adding column families to table descriptor
            tableDescriptor.addFamily(new HColumnDescriptor("personnal"));
            tableDescriptor.addFamily(new HColumnDescriptor("professionnal"));

            //execute the table through admin
            admin.createTable(tableDescriptor);
            System.out.println("table created");

        }*/
        
          // Getting all the list of tables using HBaseAdmin object
      HTableDescriptor[] tableDescriptor = admin.listTables();

     
      // printing all the table names.
      for (int i=0; i<tableDescriptor.length;i++ ){
         System.out.println(tableDescriptor[i].getNameAsString());
      
            Collection<HColumnDescriptor>    tableColumnDescriptors =  tableDescriptor[i].getFamilies();
          for (HColumnDescriptor tableColumnDescriptor : tableColumnDescriptors) {
              
               System.out.println(tableColumnDescriptor.getNameAsString());
          }
      }

    }

}
