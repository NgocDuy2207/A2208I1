package Vehicle_Management.Service.impl;

import Vehicle_Management.Model.XeTai;
import Vehicle_Management.Service.IService;

import java.util.ArrayList;
import java.util.List;

public class XeTaiService implements IService {

    List<XeTai> xeTaiList = new ArrayList<>();

    public XeTaiService() {
        xeTaiList.add(new XeTai("92h112", "a1", 2021, "ngoc duy", 1000));
        xeTaiList.add(new XeTai("92h111", "a2", 2022, "ngoc duy", 1500));
        xeTaiList.add(new XeTai("92h112", "a3", 2023, "ngoc duy", 2000));
    }

    public void add(XeTai xeTai) {
        this.xeTaiList.add(xeTai);
    }

    public void remove(String deleteBienSo) {
        for (int i = 0; i < xeTaiList.size(); i++) {
            if (xeTaiList.get(i).getBienSo() == deleteBienSo) {
                xeTaiList.remove(i);
                break;
            }
        }
    }

    public void remove() {

    }

    public void search() {
    }

    @Override
    public void displayAll() {
        for (XeTai e : xeTaiList) {
             System.out.println(e);
          }
    }
}
