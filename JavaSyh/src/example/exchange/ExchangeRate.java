package example.exchange;

// 환율 정리
// 미국 1 달러 = 1,300원 
// 일본 100엔 = 958 원
// 중국 1위안 = 188 원
public class ExchangeRate {

	// 넣을 화폐 : (ex. 원화 , 달러 ,엔화, 위완화 ...)
	private String exchangingCurrency;
	// 바꿀 화폐 : (ex. 원화 , 달러 ,엔화, 위완화 ...)
	private String exchangedCurrency;
	// 환율 (1000 / 1316.30)
	private double exchangeRate;

	public ExchangeRate(String exchangingCurrency, 
			String exchangedCurrency, 
			double exchangeRate) {
		this.exchangedCurrency = exchangedCurrency;
		this.exchangingCurrency = exchangingCurrency;
		this.exchangeRate = exchangeRate;
	}
	// Get 메서드
	// 인스턴스가 가지고 있는 특정 인스턴스 변수의 값을 반환해주기 위한 메서드
	
	public String getExchangingCurrency() {
		return this.exchangingCurrency;
	}
	
	public String getExchangedCurrency() {
		return this.exchangedCurrency;
	}
	public double getExchangeRate() {
		return this.exchangeRate;
	}
	// Set 메서드
	// 인스턴스가 가지고 있는 특정 인스턴스 변수를 변경 할 때 사용하는 메서드
	// 반환은 하지 않는다
	public void setExchangingCurrency(String exchangingCurrency) {
		this.exchangingCurrency = exchangingCurrency;
	}

	public void setExchangedCurrency(String exchangedCurrency) {
		this.exchangedCurrency = exchangedCurrency;
	}


	public void setExchangeRate(double exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	@Override
	public String toString() {
		return "ExchangeRate [exchangingCurrency=" + exchangingCurrency + 
				", exchangedCurrency=" + exchangedCurrency
				+ ", exchangeRate=" + exchangeRate + "]";
	}

}