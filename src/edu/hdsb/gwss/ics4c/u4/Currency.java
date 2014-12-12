/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics4c.u4;

import java.math.BigDecimal;

/**
 *
 * @author Nick
 */
public class Currency {

    public BigDecimal convert(BigDecimal amount, BigDecimal rate) {
        BigDecimal answer;
        answer = amount.multiply(rate);
        answer = answer.setScale(2, BigDecimal.ROUND_HALF_UP);
        return answer;
    }

}
