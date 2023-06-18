package RequestDtos;

public class AssociateDocDto {
	private Integer docId;
    public AssociateDocDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AssociateDocDto(Integer docId, Integer centerId) {
		super();
		this.docId = docId;
		this.centerId = centerId;
	}
	public Integer getDocId() {
		return docId;
	}
	public void setDocId(Integer docId) {
		this.docId = docId;
	}
	public Integer getCenterId() {
		return centerId;
	}
	public void setCenterId(Integer centerId) {
		this.centerId = centerId;
	}
	private Integer centerId;
}
