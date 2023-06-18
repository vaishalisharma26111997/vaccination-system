package RequestDtos;

public class UpdateEmailDto {
	 private int userId;
	    public UpdateEmailDto() {
		super();
		// TODO Auto-generated constructor stub
	}
		public UpdateEmailDto(int userId, String newEmailId) {
		super();
		this.userId = userId;
		this.newEmailId = newEmailId;
	}
		private String newEmailId;
		public int getUserId() {
			return userId;
		}
		public void setUserId(int userId) {
			this.userId = userId;
		}
		public String getNewEmailId() {
			return newEmailId;
		}
		public void setNewEmailId(String newEmailId) {
			this.newEmailId = newEmailId;
		}
}
