
package sample.user.crud.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour readResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="readResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="status" type="{http://basic.crud.user.sample}status"/>
 *         &lt;element name="user" type="{http://basic.crud.user.sample}sampleUser" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readResponse", propOrder = {
    "status",
    "user"
})
public class ReadResponse {

    @XmlElement(required = true)
    protected Status status;
    protected SampleUser user;

    /**
     * Obtient la valeur de la propriété status.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Définit la valeur de la propriété status.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    /**
     * Obtient la valeur de la propriété user.
     * 
     * @return
     *     possible object is
     *     {@link SampleUser }
     *     
     */
    public SampleUser getUser() {
        return user;
    }

    /**
     * Définit la valeur de la propriété user.
     * 
     * @param value
     *     allowed object is
     *     {@link SampleUser }
     *     
     */
    public void setUser(SampleUser value) {
        this.user = value;
    }

}
