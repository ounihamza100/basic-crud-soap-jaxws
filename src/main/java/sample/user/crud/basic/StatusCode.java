
package sample.user.crud.basic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour statusCode.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="statusCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="WARNING"/>
 *     &lt;enumeration value="ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "statusCode")
@XmlEnum
public enum StatusCode {

    OK,
    WARNING,
    ERROR;

    public String value() {
        return name();
    }

    public static StatusCode fromValue(String v) {
        return valueOf(v);
    }

}
