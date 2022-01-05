/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acosux.MSCorreos.util;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author mario
 */
public class CorreosUtil {

    public static Timestamp timestamp(String fecha) {
        return new Timestamp(fechaFormatoDate(fecha).getTime());
    }

    public static Date fechaFormatoDate(String fecha) {
        try {
            return formatoFecha.parse(fecha);
        } catch (ParseException e) {
            return new Date();
        }
    }

    private static final SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
}
