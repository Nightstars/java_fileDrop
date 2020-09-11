package com.christ.filedrop.fileservice;

import com.christ.filedrop.repositpoy.FileList;

import java.util.ArrayList;
import java.util.List;

public class FileServices {
    public List fileList1(){
        FileList fileList=new FileList();
        String baseDIR = "F:\\mymovies";
        //    找扩展名为txt的文件
        String fileName = "*.mp4";
        List resultList = new ArrayList();
        fileList.findFiles(baseDIR, fileName,resultList);
        if (resultList.size() == 0) {
            //System.out.println("No File Fount.");
            return null;
        } else {
           return resultList;
        }
    }
    public List fileList2(){
        FileList fileList=new FileList();
        String baseDIR = "F:\\mymovies";
        //    找扩展名为txt的文件
        String fileName = "*.mkv";
        List resultList = new ArrayList();
        fileList.findFiles(baseDIR, fileName,resultList);
        if (resultList.size() == 0) {
            //System.out.println("No File Fount.");
            return null;
        } else {
            return resultList;
        }
    }
    public List fileList(){
        FileServices fileServices=new FileServices();
        List files1=fileServices.fileList1();
        List files2=fileServices.fileList2();
        if(files2!=null){
            if (files2.size()>0){
                for (Object file:files2) {
                    files1.add(file);
                }
            }
        }
        return files1;
    }
}
