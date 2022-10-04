/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package mahasiswa;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

//import javax.inject.Named;
//import javax.enterprise.context.Dependent;

/**
 *
 * @author Kanira
 */
//@Named(value = "mahasiswa")
//@Dependent

@ManagedBean
@SessionScoped
public class Mahasiswa {

    public String scode, nama;

    public String getScode() {
        return scode;
    }

    public void setScode(String scode) {
        this.scode = scode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * Creates a new instance of Mahasiswa
     */
    public Mahasiswa(String scode, String nama) {
        this.scode = scode;
        this.nama = nama;
    }
    
}
