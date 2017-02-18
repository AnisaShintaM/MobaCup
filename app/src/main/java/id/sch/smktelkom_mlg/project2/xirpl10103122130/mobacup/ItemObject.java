package id.sch.smktelkom_mlg.project2.xirpl10103122130.mobacup;

/**
 * Created by riani on 18/02/2017.
 */

public class ItemObject {
    private int gambar;
    private String judul;
    private String deskripsi;

    public ItemObject(int gambar, String judul, String deskripsi) {
        this.gambar = gambar;
        this.judul = judul;
        this.deskripsi = deskripsi;
    }

    public int getGambar() {
        return gambar;
    }

    public String getJudul() {
        return judul;
    }

    public String getDeskripsi() {
        return deskripsi;
    }
}
