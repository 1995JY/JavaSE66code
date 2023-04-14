package com.itheima.homework;

public class WrongAgeException extends RuntimeException {
    public WrongAgeException() {
    }

    public WrongAgeException(String message) {
        super(message);
    }
}
class WrongMathScoreException extends RuntimeException{
    public WrongMathScoreException() {
    }

    public WrongMathScoreException(String message) {
        super(message);
    }
}
class WrongEnglishScoreException extends RuntimeException{
    public WrongEnglishScoreException() {
    }

    public WrongEnglishScoreException(String message) {
        super(message);
    }
}
class WrongChineseScoreException extends RuntimeException{
    public WrongChineseScoreException() {
    }

    public WrongChineseScoreException(String message) {
        super(message);
    }
}