package demo.functions;

import demo.functions.project.Project;
import demo.functions.project.ProjectEventParam;
import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

/**
 * This is the request handler that maps to the function bean in {@link TightCouplingQuery}
 *
 * @author Kenny Bastani
 */
public class Handler extends SpringBootRequestHandler<ProjectEventParam, Project> {
}
