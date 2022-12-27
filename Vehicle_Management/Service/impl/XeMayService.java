package Vehicle_Management.Service.impl;

import Vehicle_Management.Model.XeMay;
import Vehicle_Management.Service.IService;

import java.util.ArrayList;
import java.util.List;

public class XeMayService implements IService {
    List<XeMay> xeMayList = new ArrayList<>();
    public XeMayService(){
        xeMayList.add(new XeMay("43c11234","a1", 2022,"nguyen ngoc duy",200));
        xeMayList.add(new XeMay("43c11233","a2", 2021,"nguyen ngoc duy",250));
        xeMayList.add(new XeMay("43c11234","a3", 2023,"nguyen ngoc duy",100));
    }
    public void add(XeMay xeMay){
        this.xeMayList.add(xeMay);
    }
    @Override
    public void displayAll() {
        for (XeMay e: xeMayList) {
            System.out.println(e);
        }

    }

    public void search() {
    }

    public void remove(String bienSo) {
        xeMayList.removeIf(e-> e.getBienSo() == bienSo);
    }
}
