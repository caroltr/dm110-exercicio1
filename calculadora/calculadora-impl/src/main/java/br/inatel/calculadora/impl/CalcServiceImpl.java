package br.inatel.calculadora.impl;

import br.inatel.calculadora.api.CalcService;
import br.inatel.calculadora.api.Result;

public class CalcServiceImpl implements CalcService {

	@Override
	public Result sum(Double first, Double second) {
		
		Result result = new Result();
		result.setFirst(first);
		result.setSecond(second);
		
		result.setResult(first + second);
		
		return result;
	}

	@Override
	public Result subtract(Double first, Double second) {
		Result result = new Result();
		result.setFirst(first);
		result.setSecond(second);
		
		result.setResult(first - second);
		
		return result;
	}
}