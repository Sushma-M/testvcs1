/*Generated by WaveMaker Studio*/

package com.testvcs1.mytestdatabase.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/
import com.testvcs1.mytestdatabase.service.Table2Service;
import java.io.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.hibernate.TypeMismatchException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.util.WMMultipartUtils;
import com.wavemaker.runtime.util.WMRuntimeUtils;
import com.wavemaker.runtime.file.model.DownloadResponse;
import com.wordnik.swagger.annotations.*;
import com.testvcs1.mytestdatabase.*;
import com.testvcs1.mytestdatabase.service.*;
import com.wavemaker.tools.api.core.annotations.WMAccessVisibility;
import com.wavemaker.tools.api.core.models.AccessSpecifier;

/**
 * Controller object for domain model class Table2.
 * @see com.testvcs1.mytestdatabase.Table2
 */
@RestController(value = "MyTestDatabase.Table2Controller")
@RequestMapping("/MyTestDatabase/Table2")
@Api(description = "Exposes APIs to work with Table2 resource.", value = "Table2Controller")
public class Table2Controller {

    private static final Logger LOGGER = LoggerFactory.getLogger(Table2Controller.class);

    @Autowired
    @Qualifier("MyTestDatabase.Table2Service")
    private Table2Service table2Service;

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ApiOperation(value = "Returns the list of Table2 instances matching the search criteria.")
    public Page<Table2> findTable2s(Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering Table2s list");
        return table2Service.findAll(queryFilters, pageable);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ApiOperation(value = "Returns the list of Table2 instances.")
    public Page<Table2> getTable2s(Pageable pageable) {
        LOGGER.debug("Rendering Table2s list");
        return table2Service.findAll(pageable);
    }

    /**
	 * This setter method should only be used by unit tests
	 * 
	 * @param service
	 */
    protected void setTable2Service(Table2Service service) {
        this.table2Service = service;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Creates a new Table2 instance.")
    public Table2 createTable2(@RequestBody Table2 instance) {
        LOGGER.debug("Create Table2 with information: {}", instance);
        instance = table2Service.create(instance);
        LOGGER.debug("Created Table2 with information: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the total count of Table2 instances.")
    public Long countAllTable2s() {
        LOGGER.debug("counting Table2s");
        Long count = table2Service.countAll();
        return count;
    }

    @RequestMapping(value = "/{id:.+}", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the Table2 instance associated with the given id.")
    public Table2 getTable2(@PathVariable("id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Getting Table2 with id: {}", id);
        Table2 instance = table2Service.findById(id);
        LOGGER.debug("Table2 details with id: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/{id:.+}", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Updates the Table2 instance associated with the given id.")
    public Table2 editTable2(@PathVariable("id") Integer id, @RequestBody Table2 instance) throws EntityNotFoundException {
        LOGGER.debug("Editing Table2 with id: {}", instance.getId());
        instance.setId(id);
        instance = table2Service.update(instance);
        LOGGER.debug("Table2 details with id: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/{id:.+}", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Deletes the Table2 instance associated with the given id.")
    public boolean deleteTable2(@PathVariable("id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Deleting Table2 with id: {}", id);
        Table2 deleted = table2Service.delete(id);
        return deleted != null;
    }
}
