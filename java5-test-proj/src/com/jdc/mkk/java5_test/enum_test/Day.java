package com.jdc.mkk.java5_test.enum_test;

public enum Day implements SuperInterface{
	MON("Monday") {
		@Override
		void showName() {
			System.out.println("This is monday");
		}

		@Override
		public void hide() {
			
		}
	},
	TUE("Tuesday") {
		@Override
		void showName() {
			System.out.println("This is tuesday");
		}

		@Override
		public void hide() {
			
		}
	},
	WED("Wendesday") {
		@Override
		void showName() {
			System.out.println("This is wendesday");
		}

		@Override
		public void hide() {
			
		}
	},
	THU("Thurday") {
		@Override
		void showName() {
			System.out.println("This is thurday");
		}

		@Override
		public void hide() {
			
		}
	},
	FRI("Friday") {
		@Override
		void showName() {
			System.out.println("This is Friday");
		}

		@Override
		public void hide() {
			// TODO Auto-generated method stub
			
		}
	},
	SAT("Saturday") {
		@Override
		void showName() {
			System.out.println("This is satday");
		}

		@Override
		public void hide() {
			
		}
	},
	SUN("Sunday") {
		@Override
		void showName() {
			System.out.println("This is sunday");
		}

		@Override
		public void hide() {
			
		}
	};
	private String name;
	
	abstract void showName();
	Day(String name){
		this.name=name;
	}
	@Override
	public String toString() {
		return name;
	}
}
