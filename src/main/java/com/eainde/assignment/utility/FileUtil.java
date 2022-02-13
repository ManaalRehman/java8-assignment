package com.eainde.assignment.utility;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
    private static final String FILE_NAME="Employee.csv";

    public List<String> getFile() throws IOException {
        List<String> employeeList=new ArrayList<>();
        FileInputStream inputStream=null;
        try {
            ClassLoader classLoader = this.getClass().getClassLoader();
            File configFile=new File(classLoader.getResource(FILE_NAME).getFile());

            inputStream = new FileInputStream(configFile);
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while ((line = reader.readLine()) != null) {
                employeeList.add(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }catch (IOException e) {
            e.printStackTrace();
        } finally {
            inputStream.close();
        }
        return employeeList;
    }
}
