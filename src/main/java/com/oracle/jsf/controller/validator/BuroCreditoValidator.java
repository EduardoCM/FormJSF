package com.oracle.jsf.controller.validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;


@FacesValidator(value = "buroCreditoValidator")
public class BuroCreditoValidator implements Validator {

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) 
            throws ValidatorException {
        
        String nombre = String.valueOf(value);
        
        
        String[] nombresBuro = {"Eduardo", "Luis", "Gerardo", "Raul"};
        
        for (String string : nombresBuro) {
            if(nombre.equalsIgnoreCase(string)){
                FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Cliente el buro de credito", "Cliente en buro de Credito");
                throw new ValidatorException(msg);
            }
        }
    
    }
    
    
    
}
