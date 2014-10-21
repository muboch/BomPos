package ch.mubo.pos.persistence.data;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import ch.mubo.pos.persistence.api.EntityObject;
import ch.mubo.pos.persistence.api.EntityPlugin;

/**
 * Entity implementation class for Entity: CashRegister
 *
 */
@Entity
@EntityListeners(EntityPlugin.class)
public class CashRegister implements Serializable, EntityObject {

	private static final long serialVersionUID = 7388329414179571152L;

	@Id
	@Column(name = "ID")
	private String id;
	private Date date_open;
	private Date date_close;
	private Set<Ticket> tickets = new HashSet<>();
	private Set<Payment> payments = new HashSet<>();
	private String host;
	private Integer serialnr;
	private Double cashCarryForward;
	private Double cashDifference;

	public Date getDate_open() {
		return date_open;
	}

	public void setDate_open(Date date_open) {
		this.date_open = date_open;
	}

	public Date getDate_close() {
		return date_close;
	}

	public void setDate_close(Date date_close) {
		this.date_close = date_close;
	}

	public Set<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(Set<Ticket> tickets) {
		this.tickets = tickets;
	}

	public Set<Payment> getPayments() {
		return payments;
	}

	public void setPayments(Set<Payment> payments) {
		this.payments = payments;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public Integer getSerialnr() {
		return serialnr;
	}

	public void setSerialnr(Integer serialnr) {
		this.serialnr = serialnr;
	}

	public Double getCashCarryForward() {
		return cashCarryForward;
	}

	public void setCashCarryForward(Double cashCarryForward) {
		this.cashCarryForward = cashCarryForward;
	}

	public Double getCashDifference() {
		return cashDifference;
	}

	public void setCashDifference(Double cashDifference) {
		this.cashDifference = cashDifference;
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public void setId(String id) {
		this.id = id;
	}

}
