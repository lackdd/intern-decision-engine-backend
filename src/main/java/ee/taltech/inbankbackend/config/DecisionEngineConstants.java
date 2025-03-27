package ee.taltech.inbankbackend.config;

import java.math.BigDecimal;

/**
 * Holds all necessary constants for the decision engine.
 */
public class DecisionEngineConstants {
    public static final Integer MINIMUM_LOAN_AMOUNT = 2000;
    public static final Integer MAXIMUM_LOAN_AMOUNT = 10000;
    public static final Integer MAXIMUM_LOAN_PERIOD = 48;
    public static final Integer MINIMUM_LOAN_PERIOD = 12;
    public static final Integer SEGMENT_1_CREDIT_MODIFIER = 100;
    public static final Integer SEGMENT_2_CREDIT_MODIFIER = 300;
    public static final Integer SEGMENT_3_CREDIT_MODIFIER = 1000;
    public static final Integer LIFE_EXPECTANCY_ESTONIA = 79;
    public static final BigDecimal LIFE_EXPECTANCY_LITHUANIA = BigDecimal.valueOf(77.3);
    public static final BigDecimal LIFE_EXPECTANCY_LATVIA = BigDecimal.valueOf(75.9);
}
