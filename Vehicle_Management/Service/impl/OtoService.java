package Vehicle_Management.Service.impl;

import Vehicle_Management.Model.Oto;
import Vehicle_Management.Service.IService;

import java.util.ArrayList;
import java.util.List;

public class OtoService implements IService {
    List<Oto> otoList = new ArrayList<>();

    public OtoService(){
        otoList.add(new Oto("43c112","a1", 431112, "ngoc duy", 12,"Du Lich"));
        otoList.add(new Oto("43c113","a2", 2002, "ngoc duy", 20,"Xe Khach"));
        otoList.add(new Oto("43c114","a3", 431112, "ngoc duy", 21,"Du Lich"));
    }
    public void add(Oto oto){
        this.otoList.add(oto);
    }
    public void display(){

    }
    public void remove(String bienSo) {

        
        for (int i = 0 ; i < otoList.size();i++){
            if (otoList.get(i).getBienSo() == bienSo){
                otoList.remove(i);
                break;
            }
        }
        //otoList.removeIf(e -> e.getBienSo() == deleteBienSo);
    }

    public void search() {
    }

    @Override
    public void displayAll() {
        for (Oto e: otoList) {
            System.out.println(e);
        }
    }


}
