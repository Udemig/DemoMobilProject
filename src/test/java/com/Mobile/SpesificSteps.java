package com.Mobile;


import com.thoughtworks.gauge.Step;

public class SpesificSteps extends StepImpl {

    @Step({"<seconds> saniye beklee"})
    public void waitBySecond(int seconds) {
        try {
            logger.info(seconds + " saniye bekleniyor.");
            Thread.sleep(seconds * 1000);
            logger.info(seconds + " saniye beklendi.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}


