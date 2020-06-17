package exampleApp;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="generate_payment_page")
public class PaymentValidation implements Serializable{

	private static final long serialVersionUID = 1L;
	private String merchant_email;                
	private String secret_key; 
	
	@XmlElement
	public String getMerchant_email() {
		return merchant_email;
	}
	public void setMerchant_email(String merchant_email) {
		this.merchant_email = merchant_email;
	}
	@XmlElement
	public String getSecret_key() {
		return secret_key;
	}
	public void setSecret_key(String secret_key) {
		this.secret_key = secret_key;
	}
	@XmlElement
	public String getSite_url() {
		return site_url;
	}
	public void setSite_url(String site_url) {
		this.site_url = site_url;
	}
	@XmlElement
	public String getReturn_url() {
		return return_url;
	}
	public void setReturn_url(String return_url) {
		this.return_url = return_url;
	}
	@XmlElement
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@XmlElement
	public String getCc_first_name() {
		return cc_first_name;
	}
	public void setCc_first_name(String cc_first_name) {
		this.cc_first_name = cc_first_name;
	}
	@XmlElement
	public String getCc_last_name() {
		return cc_last_name;
	}
	public void setCc_last_name(String cc_last_name) {
		this.cc_last_name = cc_last_name;
	}
	@XmlElement
	public String getCc_phone_number() {
		return cc_phone_number;
	}
	public void setCc_phone_number(String cc_phone_number) {
		this.cc_phone_number = cc_phone_number;
	}
	@XmlElement
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	@XmlElement
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@XmlElement
	public String getProducts_per_title() {
		return products_per_title;
	}
	public void setProducts_per_title(String products_per_title) {
		this.products_per_title = products_per_title;
	}
	@XmlElement
	public String getUnit_price() {
		return unit_price;
	}
	public void setUnit_price(String unit_price) {
		this.unit_price = unit_price;
	}
	@XmlElement
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	@XmlElement
	public Float getOther_charges() {
		return other_charges;
	}
	public void setOther_charges(Float other_charges) {
		this.other_charges = other_charges;
	}
	@XmlElement
	public Float getAmount() {
		return amount;
	}
	public void setAmount(Float amount) {
		this.amount = amount;
	}
	@XmlElement
	public Float getDiscount() {
		return discount;
	}
	public void setDiscount(Float discount) {
		this.discount = discount;
	}
	@XmlElement
	public String getReference_no() {
		return reference_no;
	}
	public void setReference_no(String reference_no) {
		this.reference_no = reference_no;
	}
	@XmlElement
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	@XmlElement
	public String getIp_customer() {
		return ip_customer;
	}
	
	public void setIp_customer(String ip_customer) {
		this.ip_customer = ip_customer;
	}
	@XmlElement
	public String getIp_merchant() {
		return ip_merchant;
	}
	public void setIp_merchant(String ip_merchant) {
		this.ip_merchant = ip_merchant;
	}
	@XmlElement
	public String getBilling_address() {
		return billing_address;
	}
	public void setBilling_address(String billing_address) {
		this.billing_address = billing_address;
	}
	@XmlElement
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@XmlElement
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@XmlElement
	public String getPostal_code() {
		return postal_code;
	}
	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}
	@XmlElement
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@XmlElement
	public String getAddress_shipping() {
		return address_shipping;
	}
	public void setAddress_shipping(String address_shipping) {
		this.address_shipping = address_shipping;
	}
	@XmlElement
	public String getState_shipping() {
		return state_shipping;
	}
	public void setState_shipping(String state_shipping) {
		this.state_shipping = state_shipping;
	}
	@XmlElement
	public String getCity_shipping() {
		return city_shipping;
	}
	public void setCity_shipping(String city_shipping) {
		this.city_shipping = city_shipping;
	}
	@XmlElement
	public String getPostal_code_shipping() {
		return postal_code_shipping;
	}
	public void setPostal_code_shipping(String postal_code_shipping) {
		this.postal_code_shipping = postal_code_shipping;
	}
	@XmlElement
	public String getCountry_shipping() {
		return country_shipping;
	}
	public void setCountry_shipping(String country_shipping) {
		this.country_shipping = country_shipping;
	}
	@XmlElement
	public String getMsg_lang() {
		return msg_lang;
	}
	public void setMsg_lang(String msg_lang) {
		this.msg_lang = msg_lang;
	}
	@XmlElement
	public String getCms_with_version() {
		return cms_with_version;
	}
	public void setCms_with_version(String cms_with_version) {
		this.cms_with_version = cms_with_version;
	}
	private String site_url;                    
	private String return_url;           
	private String title;                      
	private String cc_first_name;          
	private String cc_last_name;                  
	private String cc_phone_number;                       
	private String phone_number;                 
	private String email;                                
	private String products_per_title;                                
	private String unit_price  ;                           
	private String quantity ;                           
	private Float other_charges;                       
	private Float amount;                              
	private Float discount ;                         
	private String reference_no;                           
	private String currency;                            
	private String ip_customer ;                          
	private String ip_merchant;                   
	private String billing_address;                              
	private String state ;                          
	private String city ;                                    
	private String postal_code ;                         
	private String country;                                
	private String address_shipping ;                  
	private String state_shipping;                         
	private String city_shipping;                             
	private String postal_code_shipping;                      
	private String country_shipping;                                 
	private String msg_lang;                                 
	private String cms_with_version ; 

}