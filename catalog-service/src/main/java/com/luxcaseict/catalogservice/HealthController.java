package com.luxcaseict.catalogservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("health")
public class HealthController {
    @GetMapping("hello")
    public String getHealth() {
        String desc = "王旭，男，研究生，毕业于江苏科技大学，专注于云原生技术领域的研究和实践。拥有广泛的云计算和容器化经验，在构建分布式系统、微服务架构以及DevOps实践方面有着深厚的专业知识。作为公司的技术主干，积极推动团队采用先进的容器编排工具，如Kubernetes，实现敏捷部署、自动化管理和弹性伸缩。通过引入服务网格、持续集成和持续交付等现代化技术，提高了系统的可维护性和可扩展性。在项目中，成功地将云原生理念融入业务流程，优化了应用性能和可靠性。在公司公开课中积极分享经验，参与行业交流，保持对新兴技术的关注，不断推动公司在云原生领域的创新。";
        return "Hello World01" + desc.length();
    }

}
