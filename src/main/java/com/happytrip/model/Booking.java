package com.happytrip.model;

import java.io.Serializable;
import java.util.Date;

/**
 * The persistent class for the bookings database table.
 * 
 */

public class Booking implements Serializable {
	private static final long serialVersionUID = 1L;
	private static final String BOOKING_MAPPING = "booking";

	private long bookingId;


	private Date bookingDate;


	private String bookingReferenceNo;


	private byte isCanceled;


	private String remarks;


	private float totalCost;

	//bi-directional one-to-one association to Bookingcancelation

	private BookingCancelation bookingCancelation;

	//bi-directional one-to-one association to Bookingcontact

	private BookingContact bookingcontact;

	//bi-directional one-to-one association to Bookingpayment

	private BookingPayment bookingpayment;

	//bi-directional many-to-one association to Bookingtype

	private BookingType bookingtype;

	//bi-directional one-to-one association to Flightbooking

	private FlightBooking flightbooking;

	//bi-directional one-to-one association to Hotelbooking

	private HotelBooking hotelbooking;

	//bi-directional many-to-many association to User

	private User booker;

	

    public Booking() {
    }

	public long getBookingId() {
		return this.bookingId;
	}

	public void setBookingId(long bookingId) {
		this.bookingId = bookingId;
	}

	public Date getBookingDate() {
		return (Date)this.bookingDate.clone();
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = (Date)bookingDate.clone();
	}

	public String getBookingReferenceNo() {
		return this.bookingReferenceNo;
	}

	public void setBookingReferenceNo(String bookingReferenceNo) {
		this.bookingReferenceNo = bookingReferenceNo;
	}

	public byte getIsCanceled() {
		return this.isCanceled;
	}

	public void setIsCanceled(byte isCanceled) {
		this.isCanceled = isCanceled;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public float getTotalCost() {
		return this.totalCost;
	}

	public void setTotalCost(float totalCost) {
		this.totalCost = totalCost;
	}

	public BookingCancelation getBookingcancelation() {
		return this.bookingCancelation;
	}

	public void setBookingcancelation(BookingCancelation bookingcancelation) {
		this.bookingCancelation = bookingcancelation;
	}
	
	public BookingContact getBookingcontact() {
		return this.bookingcontact;
	}

	public void setBookingcontact(BookingContact bookingcontact) {
		this.bookingcontact = bookingcontact;
	}
	
	public BookingPayment getBookingpayment() {
		return this.bookingpayment;
	}

	public void setBookingpayment(BookingPayment bookingpayment) {
		this.bookingpayment = bookingpayment;
	}
	
	public BookingType getBookingtype() {
		return this.bookingtype;
	}

	public void setBookingtype(BookingType bookingtype) {
		this.bookingtype = bookingtype;
	}
	
	public FlightBooking getFlightbooking() {
		return this.flightbooking;
	}

	public void setFlightbooking(FlightBooking flightbooking) {
		this.flightbooking = flightbooking;
	}
	
	public HotelBooking getHotelbooking() {
		return this.hotelbooking;
	}

	public void setHotelbooking(HotelBooking hotelbooking) {
		this.hotelbooking = hotelbooking;
	}
	
	public User getBooker() {
		return this.booker;
	}

	public void setBooker(User booker) {
		this.booker = booker;
	}
}