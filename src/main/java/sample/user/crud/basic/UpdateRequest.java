
package sample.user.crud.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour updateRequest complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="updateRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="user" type="{http://basic.crud.user.sample}sampleUser"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateRequest", propOrder = {
    "user"
})
public class UpdateRequest {

    @XmlElement(required = true)
    protected SampleUser user;

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
