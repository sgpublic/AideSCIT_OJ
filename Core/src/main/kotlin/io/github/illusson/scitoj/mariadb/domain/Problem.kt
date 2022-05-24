package io.github.illusson.scitoj.mariadb.domain

import io.swagger.v3.oas.annotations.media.Schema
import java.io.Serializable
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "problems")
class Problem: SampleProblem(), SimpleItem {
    @Id
    @Column(name = "p_id")
    override val id: Int = 0

    @Column(name = "p_title")
    override var title: String = ""

    @Schema(name = "create_time")
    @Column(name = "p_create_time")
    override var createTime: Date = Date()

    @Schema(name = "create_user")
    @Column(name = "p_create_user")
    override var createUser: String = ""

    @Schema(name = "edit_user")
    @Column(name = "p_edit_user")
    override var editUser: String? = null

    @Schema(name = "edit_time")
    @Column(name = "p_edit_time")
    override var editTime: Date? = null

    @Transient
    @Schema(name = "show_guest", hidden = true)
    @Column(name = "p_show_guest")
    override var showGuest: Boolean = false

    @Transient
    @Schema(name = "show_public", hidden = true)
    @Column(name = "p_show_public")
    override var showPublic: Boolean = false

    @Column(name = "p_daily")
    override var daily: Date? = null
}

open class SampleProblem: Serializable {
    open val id: Int = 0
    open var title: String = ""
    open var daily: Date? = null
}