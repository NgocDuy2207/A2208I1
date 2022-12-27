package Vehicle_Management.Service.impl;

import Vehicle_Management.Model.HangSanXuat;
import Vehicle_Management.Service.IService;

import java.util.ArrayList;
import java.util.List;

public class HangSanXuatService implements IService {

     List<HangSanXuat> hangSanXuatList = new ArrayList<>();

    public void HangSanXuatService(String maSanXuat, String tenHangSX, String quocGia) {
        hangSanXuatList.add(new HangSanXuat("a1", "Honda", "Japan"));
        hangSanXuatList.add(new HangSanXuat("a2", "Toyota", "Japan"));
        hangSanXuatList.add(new HangSanXuat("a3", "HuynhDai", "Korean"));
    }
    public void display(String maSanXuat){
        for (HangSanXuat e: hangSanXuatList) {
            if (e.getMaSanXuat().equals(maSanXuat)){
                System.out.println(e);
                break;
            }
        }
    }


    @Override
    public void displayAll() {

    }

}
