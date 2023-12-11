package br.edu.imepac.utils;

public interface IRolesForms<T> {

    T createEntityViewRepresentation();

    boolean isFieldsFormsValidate();
}
