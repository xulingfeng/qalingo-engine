/**
 * Most of the code in the Qalingo project is copyrighted Hoteia and licensed
 * under the Apache License Version 2.0 (release version 0.7.0)
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *                   Copyright (c) Hoteia, 2012-2013
 * http://www.hoteia.com - http://twitter.com/hoteia - contact@hoteia.com
 *
 */
package fr.hoteia.qalingo.web.viewbean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MarketPlaceViewBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6126149870110095644L;
	
	protected String name;
	protected String img;
	protected String url;
	
	protected List<MarketViewBean> markets = new ArrayList<MarketViewBean>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	public List<MarketViewBean> getMarkets() {
		return markets;
	}
	
	public void setMarkets(List<MarketViewBean> markets) {
		this.markets = markets;
	}
	
}
