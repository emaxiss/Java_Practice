package q7;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class TestCalculator
{
	private Calculator calc;
	@BeforeEach
	void setUp() throws Exception
	{
		calc = new Calculator();
		calc.switchOn();
	}

	@ParameterizedTest
	@CsvFileSource(resources = "calc.csv", numLinesToSkip = 1)
	void test(int num, int Op1, char sign, int Op2, int expected)
	{
		calc.addition(Op1);
		
		switch(sign)
		{
			case '+' -> calc.addition(Op2);
			case '-' -> calc.subtract(Op2);
			case '*' -> calc.multiply(Op2);
			case '/' -> calc.divide(Op2);
		}
		
		assertThat(calc.getResult()).isEqualTo(expected);
	}
}
