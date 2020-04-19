package com.universe.planets.infrastructure.rest.spring.entity.embeddedId;

import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.universe.planets.infrastructure.rest.spring.entity.PlanetEntity;
import com.universe.planets.infrastructure.rest.spring.entity.ResourceEntity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@Builder
public class PlanetsResourcesId implements Serializable {

  @ManyToOne
  @JoinColumn(name = "planet_id")
  private PlanetEntity planet;
  @ManyToOne
  @JoinColumn(name = "resource_id")
  private ResourceEntity resource;

}
