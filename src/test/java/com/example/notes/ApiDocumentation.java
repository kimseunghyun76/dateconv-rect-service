package com.example.notes;


import com.hascode.RestNotesSpringDataRest;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.MediaType;
import org.springframework.restdocs.RestDocumentation;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.documentationConfiguration;
import static org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by Helloworld
 * User : USER
 * Date : 2015-11-04
 * Time : 오후 2:25
 * To change this template use File | Settings | File and Code Templates.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = RestNotesSpringDataRest.class)
@WebAppConfiguration
public class ApiDocumentation {

    @Rule
    public final RestDocumentation restDocumentation = new RestDocumentation("target/generated-snippets");

    @Autowired
    private WebApplicationContext context;


    private MockMvc mockMvc;

    @Before
    public void setUp(){
        /*this.mockMvc = MockMvcBuilders.webAppContextSetup(this.context)
                .apply(documentationConfiguration(this.restDocumentation)).build();*/

        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.context)
                .apply(documentationConfiguration(this.restDocumentation)
                    .uris()
                    .withScheme("https")
                    .withHost("example.com")
                    .withPort(443))
                .build();
    }

    @Test
    public void 첫번째테스트() throws Exception {
        this.mockMvc.perform(get("/people").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andDo(document("people"));
    }

    @Test
    public void 두번째테스트() throws Exception {
        this.mockMvc.perform(get("/user").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andDo(document("user"));
    }

/*

    @Autowired
    private NoteRepository noteRepository;

    @Autowired
    private TagRepository tagRepository;

    @Autowired
    private ObjectMapper objectMapper;
*/

}
