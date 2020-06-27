package Pojo;

import java.util.List;

public class GetWeatherPojo {
	private int visibility;
	private CoordPojo coord;
	private List<WeatherPojo> weather;
	private String base;
	private MainPojo main;
	private WindPojo wind;
	private CloudsPojo clouds;
	private String dt;
	private SysPojo sys;
	private int id;
	private String name;
	private int cod;
	
	public int getVisibility() {
		return visibility;
	}
	public void setVisibility(int visibility) {
		this.visibility = visibility;
	}
	public CoordPojo getCoord() {
		return coord;
	}
	public void setCoord(CoordPojo coord) {
		this.coord = coord;
	}
	public List<WeatherPojo> getWeather() {
		return weather;
	}
	public void setWeather(List<WeatherPojo> weather) {
		this.weather = weather;
	}
	public String getBase() {
		return base;
	}
	public void setBase(String base) {
		this.base = base;
	}
	public MainPojo getMain() {
		return main;
	}
	public void setMain(MainPojo main) {
		this.main = main;
	}
	public WindPojo getWind() {
		return wind;
	}
	public void setWind(WindPojo wind) {
		this.wind = wind;
	}
	public CloudsPojo getClouds() {
		return clouds;
	}
	public void setClouds(CloudsPojo clouds) {
		this.clouds = clouds;
	}
	public String getDt() {
		return dt;
	}
	public void setDt(String dt) {
		this.dt = dt;
	}
	public SysPojo getSys() {
		return sys;
	}
	public void setSys(SysPojo sys) {
		this.sys = sys;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
}
