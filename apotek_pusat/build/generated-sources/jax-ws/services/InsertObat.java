
package services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for insertObat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="insertObat">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kode_obat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nama_obat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="golongan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="harga_satuan" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="kadaluarsa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertObat", propOrder = {
    "kodeObat",
    "namaObat",
    "golongan",
    "hargaSatuan",
    "kadaluarsa"
})
public class InsertObat {

    @XmlElement(name = "kode_obat")
    protected String kodeObat;
    @XmlElement(name = "nama_obat")
    protected String namaObat;
    protected String golongan;
    @XmlElement(name = "harga_satuan")
    protected int hargaSatuan;
    protected String kadaluarsa;

    /**
     * Gets the value of the kodeObat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodeObat() {
        return kodeObat;
    }

    /**
     * Sets the value of the kodeObat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodeObat(String value) {
        this.kodeObat = value;
    }

    /**
     * Gets the value of the namaObat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamaObat() {
        return namaObat;
    }

    /**
     * Sets the value of the namaObat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamaObat(String value) {
        this.namaObat = value;
    }

    /**
     * Gets the value of the golongan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGolongan() {
        return golongan;
    }

    /**
     * Sets the value of the golongan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGolongan(String value) {
        this.golongan = value;
    }

    /**
     * Gets the value of the hargaSatuan property.
     * 
     */
    public int getHargaSatuan() {
        return hargaSatuan;
    }

    /**
     * Sets the value of the hargaSatuan property.
     * 
     */
    public void setHargaSatuan(int value) {
        this.hargaSatuan = value;
    }

    /**
     * Gets the value of the kadaluarsa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKadaluarsa() {
        return kadaluarsa;
    }

    /**
     * Sets the value of the kadaluarsa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKadaluarsa(String value) {
        this.kadaluarsa = value;
    }

}
