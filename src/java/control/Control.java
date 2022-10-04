/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package control;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import mahasiswa.Mahasiswa;

//import javax.inject.Named;
//import javax.enterprise.context.Dependent;
//
///**
// *
// * @author Kanira
// */
//@Named(value = "control")
//@Dependent

@ManagedBean
@SessionScoped

public class Control {

    private List<Mahasiswa> mahasiswaList;
    private Mahasiswa mahasiswa;

    @PostConstruct
    public void init(){
    mahasiswaList = new ArrayList<Mahasiswa>();
    mahasiswa = new Mahasiswa("", "");
    }

    public List<Mahasiswa> getMahasiswaList() {
        return mahasiswaList;
    }

    public void setMahasiswaList(List<Mahasiswa> mahasiswaList) {
        this.mahasiswaList = mahasiswaList;
    }

    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    public void insert() {
        mahasiswaList.add(mahasiswa);
        mahasiswa = new Mahasiswa("", "");
    }

    public void update() {
        mahasiswa = new Mahasiswa("", "");
    }

    public void delete() {
    mahasiswaList.remove(mahasiswa);
    mahasiswa = new Mahasiswa("", "");
    }

    /**
     * Creates a new instance of Control
     */
    public Control() {
    }
    
}
