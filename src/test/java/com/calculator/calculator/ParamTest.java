package com.calculator.calculator;

import ch.qos.logback.core.BasicStatusManager;
import net.bytebuddy.asm.Advice;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParamTest {
   private final Actions calculService=new Actions();
    @ParameterizedTest
    @MethodSource("param")
    public void sum(int a,int b) {
        int result=calculService.action1(a,b);
        assertEquals(a+b,result);
    }
    @ParameterizedTest
    @MethodSource("param")
    public void minus(int a,int b) {
        int result=calculService.action2(a,b);
        assertEquals(a-b,result);
    }
    @ParameterizedTest
    @MethodSource("param")
    public void multy(int a,int b) {
        int result=calculService.action3(a,b);
        assertEquals(a*b,result);
    }
    @ParameterizedTest
    @MethodSource("param")
    public void divide(int a,int b) {
        int result=calculService.action4(a,b);
        assertEquals(a/b,result);
    }

    private static Stream<Arguments> param(){
        return Stream.of(
                Arguments.of(4,2),
                Arguments.of(6,2),
                Arguments.of(2,2)
        );
    }
}

