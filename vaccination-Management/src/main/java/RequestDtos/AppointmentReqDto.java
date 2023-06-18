package RequestDtos;

import java.time.LocalTime;
import java.util.Date;

public class AppointmentReqDto {

	 private Integer docId;

	    //int --> 0

	    private Integer userId;

	    private Date appointmentDate;

	    private LocalTime appointmentTime;

		public AppointmentReqDto() {
			super();
			// TODO Auto-generated constructor stub
		}

		public AppointmentReqDto(Integer docId, Integer userId, Date appointmentDate, LocalTime appointmentTime) {
			super();
			this.docId = docId;
			this.userId = userId;
			this.appointmentDate = appointmentDate;
			this.appointmentTime = appointmentTime;
		}

		public Integer getDocId() {
			return docId;
		}

		public void setDocId(Integer docId) {
			this.docId = docId;
		}

		public Integer getUserId() {
			return userId;
		}

		public void setUserId(Integer userId) {
			this.userId = userId;
		}

		public Date getAppointmentDate() {
			return appointmentDate;
		}

		public void setAppointmentDate(Date appointmentDate) {
			this.appointmentDate = appointmentDate;
		}

		public LocalTime getAppointmentTime() {
			return appointmentTime;
		}

		public void setAppointmentTime(LocalTime appointmentTime) {
			this.appointmentTime = appointmentTime;
		}
}
